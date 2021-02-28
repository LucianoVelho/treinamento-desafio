<template>
       <div class="container">
       <h1>Pessoa {{pessoa.nome}} {{pessoa.sobrenome}}</h1>
    <form @submit="grava()">
  <div class="form-group">
    <label for="nome">Nome</label>
    <input v-model="pessoa.nome" id="nome" autocomplete="off" class="form-control" >
  </div>
  <div class="form-group">
    <label for="sobrenome">Sobrenome</label>
    <input v-model="pessoa.sobrenome" id="sobrenome" autocomplete="off" class="form-control" >
  </div>
  <button v-on:click="say('cadastrado com sucesso');"  type="submit" href="/pessoa" class="btn btn-primary">Submit</button>
</form>
<p></p>
    </div>

</template>

<script>
import Pessoa from '../../domain/pessoa/Pessoa.js'
export default {

  data() {
    return {
       pessoa: new Pessoa(),
      pessoas: []
    }
  },

methods: {

    grava() {

      this.$http
        .post('http://localhost:3000/api/pessoa', this.pessoa)
        .then(() => this.pessoa = new Pessoa(), err => console.log(err));
    },
    say: function (message) {
      alert(message)
    }
  },
  created() {

            this.$http.get('http://localhost:3000/api/pessoas')
            .then(res => res.json())
            .then(pessoas => this.pessoas = pessoas, err => console.log(err));

    }
  }



</script>

<style>

</style>