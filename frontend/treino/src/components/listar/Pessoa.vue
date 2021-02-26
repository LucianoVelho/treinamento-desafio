<template>
  <table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Pessoas</th>
      <th scope="col">Nome</th>
      <th scope="col">Sobrenome</th>
    </tr>
  </thead>
  <tbody>
    <tr v-for="pesso in pessoas" v-if="pesso.id == id" >
      <th scope="row">{{pesso.id}}</th>
      <td>{{pesso.nome}}</td>
      <td>{{pesso.sobrenome}}</td>
    </tr>
  </tbody>
</table>
</template>

<script>
import Pessoa from '../../domain/pessoa/Pessoa.js'
export default {

  data() {
    return {
       pessoa: new Pessoa(),
       pessoas: [],
       id: this.$route.params.id
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