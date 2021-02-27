<template>
     <div class="container">
      <h1 class="text-center">Treinamento TI Bluemenau</h1>
      <p></p>
      <button v-on:click="counter += 1; say('Inicializando a etapa! Deseguinando as pessoas a suas Salas e Espaços');"
      type="button" class="btn btn-primary btn-lg btn-block">Iniciar Etapa {{counter}}</button>
       <p></p>
    <div class="row">
     <div class="col-md-4">
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
     <div class="col-md-4">
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
     <div class="col-md-4">
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
     </div>
</template>

<script>
export default {

  data() {
    return {
       pessoas: [],
       id: this.$route.params.id,
       espacos:[],
       salas:[],
       counter: 0
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

    },
     methods: {
    say: function (message) {
      alert(message)
    },
     etapa: function (counter) {
      if(counter < 3){
           counter = 0
      }else{
           cauter = +1
      }
    }
  }
  }


</script>

<style>

</style>