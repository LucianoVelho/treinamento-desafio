<template>
       <div class="container">
       <h1>Sala</h1>
    <form @submit="grava()">
  <div class="form-group">
    <label for="nome">Nome</label>
    <input v-model="sala.nome" id="nome" autocomplete="off" class="form-control" >
  </div>
  <div class="form-group">
    <label for="lotacao">Lotação</label>
    <input v-model="sala.lotacao" id="lotacao" autocomplete="off" class="form-control" >
  </div>
  <button type="submit"  class="btn btn-primary">Submit</button>
</form>
<p></p>
<div class="table-responsive">
<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Sala</th>
      <th scope="col">Nome</th>
      <th scope="col">Lotação</th>
    </tr>
  </thead>
  <tbody>
    <tr v-for="sal in salas" >
      <th scope="row">{{sal.id}}</th>
       <router-link :to="{ name: 'sala', params: { id : sal.id }}">
      <td>{{sal.nome}}</td>
      </router-link>
      <td>{{sal.lotacao}}</td>
    </tr>
  </tbody>
</table>
</div>
    </div>

</template>

<script>
import Sala from '../../domain/sala/Sala.js'
export default {

  data() {
    return {
      sala: new Sala(),
      salas: []
    }
  },

methods: {

    grava() {

      this.$http
        .post('http://localhost:3000/api/sala', this.sala)
        .then(() => this.sala = new Sala(), err => console.log(err));
    }
  },
  created() {

            this.$http.get('http://localhost:3000/api/salas')
            .then(res => res.json())
            .then(salas => this.salas = salas, err => console.log(err));

    }
  }



</script>

<style>

</style>