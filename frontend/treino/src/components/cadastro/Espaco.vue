<template>
       <div class="container">
       <h1>Espaco</h1>
    <form @submit="grava()">
  <div class="form-group">
    <label for="nome">Nome</label>
    <input v-model="espaco.nome" id="nome" autocomplete="off" class="form-control" >
  </div>
  <div class="form-group">
    <label for="sobrenome">Lotação</label>
    <input v-model="espaco.lotacao" id="lotacao" autocomplete="off" class="form-control" >
  </div>
  <button v-on:click="say('cadastrado com sucesso');"  type="submit"  class="btn btn-primary">Submit</button>
</form>
<p></p>

    </div>

</template>

<script>
import Espaco from '../../domain/espaco/Espaco.js'
export default {

  data() {
    return {
       espaco: new Espaco(),
      espacos: []
    }
  },

methods: {

    grava() {

      this.$http
        .post('http://localhost:3000/api/espaco', this.espaco)
        .then(() => this.espaco = new Espaco(), err => console.log(err));
    },
     say: function (message) {
      alert(message)
    },
  },
  created() {

            this.$http.get('http://localhost:3000/api/espacos')
            .then(res => res.json())
            .then(espacos => this.espacos = espacos, err => console.log(err));

    }
  }



</script>

<style>

</style>