<template>
<div class="container">
<div class="row">
<div class="col-md-6">
<h1>Espaço</h1>
<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Espaço</th>
      <th scope="col">Nome</th>
      <th scope="col">Lotação</th>
    </tr>
  </thead>
  <tbody>
    <tr v-for="espa in espacos" v-if="espa.id == id"  >
      <th scope="row">{{espa.id}}</th>
      <td>{{espa.nome}}</td>
      <td>{{espa.lotacao}}</td>
    </tr>
  </tbody>
</table>
</div>
<p></p>

<p></p>
<div class="col-md-6">
<h1>Participantes do Espaço</h1>
<table class="table table-striped" v-for="espa in espacos" v-if="espa.id == id">
  <thead>
    <tr>
      <th scope="col">Pessoa</th>
      <th scope="col">Nome</th>
      <th scope="col">Sobrenome</th>
    </tr>
  </thead>
  <tbody>
    <tr v-for="pessoa in espa.pessoas">
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
import Espaco from '../../domain/espaco/Espaco.js'
export default {

  data() {
    return {
       espaco: new Espaco(),
       espacos: [],
       id: this.$route.params.id,
       pessoas:[]
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