<template>
  <card>
    <h4 slot="header" class="card-title">Sign Up</h4>
    <form>
      <div class="row">
        <div class="col-md-5">
          <fg-radio type="radio" name="selectInput" id="userChecked" value="userId" @input="checkedRadios"></fg-radio>
          <fg-input type="text" placeholder="userId" id="userId" v-model="user.userId" readonly></fg-input>
        </div>
      </div>
      <div class="row">
        <div class="col-md-5">
          <fg-radio type="radio" name="selectInput" value="userPw" @input="checkedRadios"></fg-radio>
          <fg-input type="text" placeholder="userPw" id="userPw" v-model="user.userPw" readonly></fg-input>
        </div>
      </div>
      <div class="row">
        <div class="col-md-5">
          <fg-radio type="radio" name="selectInput" value="userEmail" @input="checkedRadios"></fg-radio>
          <fg-input type="text" placeholder="userEmail" id="userEmail" v-model="user.userEmail" readonly></fg-input>
        </div>
      </div>
      <div class="row">
        <div class="col-md-5">
          <fg-radio type="radio" name="selectInput" id="aa22" value="userAddress" @input="checkedRadios"></fg-radio>
          <fg-input type="text" placeholder="userAddress" id="userAddress" v-model="user.userAddress" readonly></fg-input>          
        </div>
      </div>
      <hr>
      <div class="row">
        <div class="col-md-5">
          <fg-input type="text" placeholder="정보를 입력하세요" id="dynamicInput" @input="changeDynamicInput"></fg-input>     
          <button type="submit" class="btn btn-info btn-fill" style="margin-left:10px;">
            Save
          </button>
        </div>
      </div>
    </form>
  </card>
</template>
<script>
import Card from '@/components/UIComponents/Cards/Card.vue'
export default {
  components: {
    Card
  },
  inheritAttrs: false,
  props: {
    label: String,
    value: [String, Number],
    addonRightIcon: String,
    addonLeftIcon: String
  },
  data () {
    return {
      user: {
        userId: '',
        userPw: '',
        userEmail: '',
        userAddress: '',
        selectInput: ''
      }
    }
  },
  tempData: {
    checkedRadio: ''
  },
  created () {
    this.$http.get('/api/getSignUpData').then(resp => {
      console.log(resp)
    })
  },
  mounted () {
    document.getElementById('userChecked').click()
  },
  methods: {
    changeDynamicInput: event => {
      let eventValue = event.target.value
      if (this.a.tempData.checkedRadio === '') {
        alert('입력할 정보를 선택하세요.')
        eventValue = ''
        return false
      }
      document.getElementById(this.a.tempData.checkedRadio).value = eventValue
    },

    checkedRadios: value => {
      document.getElementById('dynamicInput').value = ''
      this.a.tempData.checkedRadio = value
    }
  }
}
</script>
