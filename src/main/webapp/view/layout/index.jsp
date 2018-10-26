<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html lang="en">
<head>
<title>主页</title>
<link href="${pageContext.request.contextPath}${pageContext.request.contextPath}/static/plugins/bootstrap/css/bootstrap.min.css"
	rel="stylesheet"></link>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/plugins/font-awesome/css/font-awesome.css"></link>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/plugins/plugins/layui/css/layui.css"
	media="all"></link>

<link rel="stylesheet" href="${pageContext.request.contextPath}/static/plugins/css/app.css"
	media="all"></link>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/plugins/css/layout.css"
	media="all"></link>	
<style type="text/css">
table {
	border-collapse: collapse;
	width: 100%;
}

th, td {
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #f2f2f2
}

th {
	background-color: #4CAF50;
	color: white;
}
</style>
</head>
<body>
	<div class="layui-layout layui-layout-admin kit-layout-admin"
		id="layout">
		<div class="layui-header">
			<div class="layui-logo">测试管理系统</div>
			<div class="layui-logo kit-logo-mobile"></div>
			<!--<ul class="layui-nav layui-layout-left kit-nav">
                <li class="layui-nav-item"><a href="javascript:;">控制台</a></li>
                <li class="layui-nav-item"><a href="javascript:;">商品管理</a></li>
                <li class="layui-nav-item"><a href="javascript:;" id="pay"><i class="fa fa-gratipay" aria-hidden="true"></i> 捐赠我</a></li>
                <li class="layui-nav-item">
                    <a href="javascript:;">其它系统</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">邮件管理</a></dd>
                        <dd><a href="javascript:;">消息管理</a></dd>
                        <dd><a href="javascript:;">授权管理</a></dd>
                    </dl>
                </li>
            </ul>-->
			<ul class="layui-nav layui-layout-right kit-nav">
				<li class="layui-nav-item"><a href="javascript:;"> <img
						src="${pageContext.request.contextPath}/static/plugins/images/logo.png"
						class="layui-nav-img">imp</img>
				</a> <!--<dl class="layui-nav-child">
                        <dd><a href="javascript:;">基本资料</a></dd>
                        <dd><a href="javascript:;">安全设置</a></dd>
                    </dl>--></li>
				<!--<li class="layui-nav-item">
                    <a href="javascript:;" @click="showMessage" id="message">
                        <i class="fa fa-bell-o hava-message" aria-hidden="true"></i> 消息
                        <span class="layui-badge">9</span>
                    </a>
                </li>-->
				<li class="layui-nav-item"><a href="javascript:;"
					click="exit()"><i class="fa fa-sign-out" aria-hidden="true"></i>
						注销</a></li>
			</ul>
		</div>
		<div class="layui-side layui-bg-black kit-side">
			<div class="layui-side-scroll">
				<div class="kit-side-fold">
					<i class="fa fa-navicon" aria-hidden="true"></i>
				</div>
				<!-- options={url:'main.html',icon:'&#xe658;',title:'Navbar',id:'-1'} 
                url:要打开的页面；icon:tab icon图标；title:tab标题；id:tab的唯一id(不可重复，遵守规则（一级菜单十位递增，二级在一级菜单一位递增）) -->
				<ul class="layui-nav layui-nav-tree" lay-filter="kitNavbar"
					kit-navbar="kit-navbar">

				</ul>
			</div>
		</div>
		<div class="layui-body" id="container">
			<!-- 内容主体区域 -->
			<div style="padding: 15px;">内容加载中,请稍等...</div>
		</div>

		<div class="layui-footer" v-if="false">
			<!-- 底部固定区域 -->
			2018&copy;
		</div>
	</div>
	<script src="${pageContext.request.contextPath}/static/plugins/plugins/layui/layui.js"></script>
	<script src="${pageContext.request.contextPath}/static/plugins/plugins/vue/vue.min.js"></script>
	<script>
    var http = '',
    form = '';
$ = '';
var addTab,
    layerCRBoat;
new Vue({
    el: '#layout',
    data: {
        isOpen: true,
        userInfo: {}
    },
    created() {
        this.init();
    },
    methods: {
        showMessage() {
            var options = {
                url: 'views/message.html',
                icon: '&#xe63a;',
                title: '消息管理',
                id: '22'
            }
            window.parent.addTab(options)
        },
        closeDialog() {
            layer.close(layerCRBoat);
        },
        //退出登录
        exit() {
            var vm = this;
            layer.confirm('您确定要退出登录吗？', {
                btn: ['确定', '取消'] //按钮
            }, function() {
            }, function() {

            });
        },
        init() {
            var vm = this;
            var message;

            layui.config({
                base: '${pageContext.request.contextPath}/static/plugins/js/'
            }).use(['app', 'message', 'element', 'http', 'form'], function() {
                var app = layui.app,
                    element = layui.element,
                    navbar = layui.navbar,
                    tab = layui.tab,
                    layer = layui.layer;

                http = layui.http;
                $ = layui.jquery;
                form = layui.form;

                //将message设置为全局以便子页面调用
                message = layui.message;
                //主入口
                app.set({
                    type: 'iframe'
                }).init();

                var menu = [{id:"1",title:"用户管理",icon:"fa-snowflake-o",
                	url:"${pageContext.request.contextPath}/user/index"},{id:"2",title:"菜单管理",icon:"fa-snowflake-o",
                    url:"${pageContext.request.contextPath}/user/index"}];
                console.log(menu);
				/*
                menu.push({
                    id: "",
                    title: "",
                    icon: "",
                    url: ""
                });*/

                navbar.set({
                    data: menu
                }).render(function(data) {
                    refreshTab(data.id);
                    tab.tabAdd(data);
                });

                //添加指定Tab项
                addTab = function(options) {
                    element.tabDelete('kitTab', options.id);
                    $('li.layui-nav-item:last').find('a').data('options', JSON.stringify(options));
                    $('li.layui-nav-item:last').find('a').trigger('click');
                }

                //删除指定Tab项
                delTab = function(pid) {
                    element.tabDelete('kitTab', pid);
                }

                //刷新指定Tab项
                refreshTab = function(pid) {
                    var item = $('.layui-tab-item[lay-item-id=' + pid + ']');
                    if (!item.length) {
                        return false;
                    }
                    var iframe = $(item).children("iframe");
                    iframe.attr("src", iframe.attr("src"));
                }

                //切换到指定Tab项
                changeTab = function(pid) {
                    element.tabChange('kitTab', pid); //切换到：用户管理
                }

                //隐藏最后一个菜单，用来装载页面添加的菜单
             /*   setTimeout(function() {
                    $('li.layui-nav-item:last').css('display', 'none');
                }, 100);  */

                $(document).on('click', '.layui-nav-item a', function() {
                    $(this).addClass('active');
                    $(this).parents('.layui-nav-item').siblings().find('a').removeClass('active');
                    $(this).parents('.layui-nav-item').siblings().removeClass('layui-this');
                });
                //监听点击menu
                element.on('nav(kitNavbar)', function(elem) {
                    $(elem).parent('.layui-nav-child').siblings('a').addClass('active');
                    $(elem).parents('.layui-nav-item').siblings().find('a').removeClass('active');
                    $(elem).siblings().find('a').removeClass('active');
                });
                // 监听点击tab
                $(document).on('click', '.layui-tab li', function() {
                    var pid = $(this).attr('lay-id');
                    refreshTab(pid);
                });
            });
        }
    }
});
    </script>
</body>
</html>