import DashboardLayout from '../components/Dashboard/Layout/DashboardLayout.vue'
// GeneralViews
import NotFound from '../components/GeneralViews/NotFoundPage.vue'

// Admin pages, examples
import Overview from '@/components/Dashboard/Views/Overview.vue'
import UserProfile from '@/components/Dashboard/Views/UserProfile.vue'
import TableList from '@/components/Dashboard/Views/TableList.vue'
import Typography from '@/components/Dashboard/Views/Typography.vue'
import Icons from '@/components/Dashboard/Views/Icons.vue'
import Notifications from '@/components/Dashboard/Views/Notifications.vue'

import Radio from '@/components/UIComponents/Inputs/Radio.vue'

import SignUp from '@/components/Views/sym/SignUp.vue'

const routes = [
  {
    path: '/admin',
    component: DashboardLayout,
    redirect: '/admin/overview',
    children: [
      {
        path: 'overview',
        name: 'Overview',
        component: Overview
      },
      {
        path: 'user',
        name: 'User',
        component: UserProfile
      },
      {
        path: 'table-list',
        name: 'Table List',
        component: TableList
      },
      {
        path: 'typography',
        name: 'Typography',
        component: Typography
      },
      {
        path: 'icons',
        name: 'Icons',
        component: Icons
      },
      {
        path: 'notifications',
        name: 'Notifications',
        component: Notifications
      },
      {
        path: 'radio',
        name: 'Radio',
        component: Radio
      }
    ]
  },
  {
    path: '/sym',
    component: DashboardLayout,
    redirect: '/sym/signup',
    children: [{
      path: 'signup',
      name: 'SignUp',
      component: SignUp
    }]
  },
  { path: '*', component: NotFound }
]

/**
 * Asynchronously load view (Webpack Lazy loading compatible)
 * The specified component must be inside the Views folder
 * @param  {string} name  the filename (basename) of the view to load.
function view(name) {
   var res= require('../components/Dashboard/Views/' + name + '.vue');
   return res;
};**/

export default routes
