import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import yuyueguahao from '@/views/modules/yuyueguahao/list'
    import yachibaojianchanpin from '@/views/modules/yachibaojianchanpin/list'
    import fuchatixing from '@/views/modules/fuchatixing/list'
    import messages from '@/views/modules/messages/list'
    import huiyuan from '@/views/modules/huiyuan/list'
    import orders from '@/views/modules/orders/list'
    import yaopinxinxi from '@/views/modules/yaopinxinxi/list'
    import binglijiuzhenxinxi from '@/views/modules/binglijiuzhenxinxi/list'
    import storeup from '@/views/modules/storeup/list'
    import config from '@/views/modules/config/list'
    import discussyachibaojianchanpin from '@/views/modules/discussyachibaojianchanpin/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/news',
        name: '牙齿保护小知识',
        component: news
      }
          ,{
	path: '/yuyueguahao',
        name: '预约挂号',
        component: yuyueguahao
      }
          ,{
	path: '/yachibaojianchanpin',
        name: '牙齿保健产品',
        component: yachibaojianchanpin
      }
          ,{
	path: '/fuchatixing',
        name: '复查提醒',
        component: fuchatixing
      }
          ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
          ,{
	path: '/huiyuan',
        name: '会员',
        component: huiyuan
      }
          ,{
        path: '/orders/:status',
        name: '订单管理',
        component: orders
      }
          ,{
	path: '/yaopinxinxi',
        name: '药品信息',
        component: yaopinxinxi
      }
          ,{
	path: '/binglijiuzhenxinxi',
        name: '病例就诊信息',
        component: binglijiuzhenxinxi
      }
          ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
          ,{
	path: '/discussyachibaojianchanpin',
        name: '牙齿保健产品评论',
        component: discussyachibaojianchanpin
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
