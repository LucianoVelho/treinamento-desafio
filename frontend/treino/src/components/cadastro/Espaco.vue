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
  <button type="submit"  class="btn btn-primary">Submit</button>
</form>
<p></p>
<div class="table-responsive">
<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Espaços</th>
      <th scope="col">Nome</th>
      <th scope="col">Lotação</th>
    </tr>
  </thead>
  <tbody>
    <tr v-for="espa in espacos" >
      <th scope="row">{{espa.id}}</th>
     <router-link :to="{ name: 'espaco', params: { id : espa.id }}">
      <td>{{espa.nome}}</td>
      </router-link>
      <td>{{espa.lotacao}}</td>
    </tr>
  </tbody>
</table>
</div>
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
    }
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