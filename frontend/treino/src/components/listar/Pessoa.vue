<template>
  
 <div class="container">
 <p></p> 
  <p></p>
  <div class="row">
  
     <div class="col-md-4">
          <table class="table table-striped">
          <thead>
          <tr>
               <th scope="col">Pessoa</th>
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
     </div>
     <div class="col-md-4">
       <table class="table table-striped"  >
          <thead>
          <tr>
               <th scope="col">Sala</th>
               <th scope="col">Nome</th>
               <th scope="col">Lotação</th>
          </tr>
          </thead>
          <tbody v-for="sala in salas">
          <tr v-for="pesso in sala.pessoas" v-if="pesso.id == id" >
               <th scope="row">{{sala.id}}</th>
               <td>{{sala.nome}}</td>
               <td>{{sala.lotacao}}</td>
          </tr>
          </tbody>
          </table>
     </div>
     <div class="col-md-4">
          <table class="table table-striped"   >
          <thead>
          <tr>
               <th scope="col">Espaço</th>
               <th scope="col">Nome</th>
               <th scope="col">Lotação</th>
          </tr>
          </thead>
          <tbody v-for="espaco in espacos">
          <tr v-for="pesso in espaco.pessoas" v-if="pesso.id == id" >
               <th scope="row">{{espaco.id}}</th>
               <td>{{espaco.nome}}</td>
               <td>{{espaco.lotacao}}</td>
          </tr>
          </tbody>
          </table>
     </div>
    </div>
    </div>
</template>

<script>
import Pessoa from '../../domain/pessoa/Pessoa.js'
export default {

  data() {
    return {
       pessoa: new Pessoa(),
       pessoas: [],
       id: this.$route.params.id,
       espacos:[],
       salas:[]
    }
  },

 created() {

            this.$http.get('http://localhost:3000/api/pessoas')
            .then(res => res.json())
            .then(pessoas => this.pessoas = pessoas, err => console.log(err));

             this.$http.get('http://localhost:3000/api/espacos')
            .then(res => res.json())
            .then(espacos => this.espacos = espacos, err => console.log(err));

             this.$http.get('http://localhost:3000/api/salas')
            .then(res => res.json())
            .then(salas => this.salas = salas, err => console.log(err));

    }
  }


</script>

<style>

</style>