import fgInput from './components/UIComponents/Inputs/formGroupInput.vue'
import fgRadio from './components/UIComponents/Inputs/Radio.vue'
import DropDown from './components/UIComponents/Dropdown.vue'

/**
 * You can register global components here and use them as a plugin in your main Vue instance
 */

const GlobalComponents = {
  install (Vue) {
    Vue.component('fg-input', fgInput)
    Vue.component('fg-radio', fgRadio)
    Vue.component('drop-down', DropDown)
  }
}

export default GlobalComponents
