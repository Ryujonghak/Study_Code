import {createRouter, createWebHistory} from 'vue-router'

const routes = [
    //  메인 페이지
    {
        path: '/',
        alias: '/dept',
        name: 'dept',
        component: () => import(/* webpackChunkName: "about" */ '../components/dept/DeptList')
    },
    //  부서정보 추가 페이지
    {
        path: '/add/dept',
        name: 'add-dept',
        component: () => import(/* webpackChunkName: "about" */ '../components/dept/AddDept')
    },
    {
        path: '/dept/:dno',
        name: 'dept-detail',
        component: () => import(/* webpackChunkName: "about" */ '../components/dept/DeptDetail')
    },
    //  사원 정보 페이지
    {
        path: '/emp',
        name: 'emp',
        component: () => import(/* webpackChunkName: "about" */ '../components/emp/EmpList')
    },
    //  사원 추가 페이지
    {
        path: '/add/emp',
        name: 'add-emp',
        component: () => import(/* webpackChunkName: "about" */ '../components/emp/AddEmp')
    },
    {
        path: '/emp/:eno',
        name: 'emp-detail',
        component: () => import(/* webpackChunkName: "about" */ '../components/emp/EmpDetail')
    },
    {
        path: '/faq',
        name: 'faq',
        component: () => import(/* webpackChunkName: "about" */ '../components/faq/FaqList')
    },
    //  사원 추가 페이지
    {
        path: '/add/faq',
        name: 'add-faq',
        component: () => import(/* webpackChunkName: "about" */ '../components/faq/AddFaq')
    },
    {
        path: '/faq/:no',
        name: 'faq-detail',
        component: () => import(/* webpackChunkName: "about" */ '../components/faq/FaqDetail')
    }
]

const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes
})

export default router
