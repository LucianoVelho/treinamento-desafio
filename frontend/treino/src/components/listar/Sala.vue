<template>
<div class="container">
<div class="row">
<div class="col-md-6">
<h1>Sala</h1>
<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Sala</th>
      <th scope="col">Nome</th>
      <th scope="col">Lotação</th>
    </tr>
  </thead>
  <tbody>
    <tr v-for="sal in salas" v-if="sal.id == id"  >
      <th scope="row">{{sal.id}}</th>
      <td>{{sal.nome}}</td>
      <td>{{sal.lotacao}}</td>
    </tr>
  </tbody>
</table>
</div>
<p></p>
<div class="col-md-6">
<h1>Participantes da Sala</h1>
<p></p>
<table class="table table-striped" >
  <thead>
    <tr>
      <th scope="col">Pessoa</th>
      <th scope="col">Nome</th>
      <th scope="col">Sobrenome</th>
    </tr>
  </thead>
  <tbody v-for="sal in salas" v-if="sal.id == id">
    <tr v-for="pessoa in sal.pessoas">
      <th scope="row">{{pessoa.id}}</th>
      <td>{{pessoa.nome}}</td>
      <td>{{pessoa.lotacao}}</td>
    </tr>
  </tbody>
</table>
</div>
</div>
</div>
</template>

<script>
import Sala from '../../domain/sala/Sala.js'
export default {

  data() {
    return {
       sala: new Sala(),
       salas: [],
       id: this.$route.params.id,
       pessoas:[]
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