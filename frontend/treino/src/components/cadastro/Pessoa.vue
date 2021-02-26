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
  <button type="submit" href="/pessoa" class="btn btn-primary">Submit</button>
</form>
<p></p>
<div class="table-responsive">
<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Pessoas</th>
      <th scope="col">Nome</th>
      <th scope="col">Sobrenome</th>
    </tr>
  </thead>
  <tbody>
    <tr v-for="pesso in pessoas" >
      <th scope="row">{{pesso.id}}</th>
      <router-link :to="{ name: 'pessoa', params: { id : pesso.id }}">
      <td>{{pesso.nome}}</td>
      </router-link>
      <td>{{pesso.sobrenome}}</td>
    </tr>
  </tbody>
</table>
</div>
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