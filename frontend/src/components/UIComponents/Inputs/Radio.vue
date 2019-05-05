<template>
  <div class="form-check-radio" style="float:left;">
    <label :for="cbId" class="form-check-label">
      <input :id="cbId"
             type="radio"
             :name="name"
             :disabled="disabled"
             :label="label"
             :value="value"
             v-model="model" />
      <span class="form-check-sign">
        <slot></slot>
      </span>
    </label>
  </div>
</template>
<script>
  export default {
    name: 'p-radio',
    props: {
      label: [String, Number],
      disabled: [Boolean, String],
      value: [String, Boolean],
      inline: Boolean,
      name: String
    },
    data () {
      return {
        cbId: ''
      }
    },
    computed: {
      model: {
        get () {
        },
        set (value) {
          this.$emit('input', value)
        }
      },
      inlineClass () {
        if (this.inline) {
          return `radio-inline`
        }
        return ''
      }
    },
    created () {
      this.cbId = Math.random().toString(16).slice(2)
    }
  }
</script>
