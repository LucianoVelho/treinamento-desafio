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
  <button v-on:click="say('cadastrado com sucesso');" type="submit"  class="btn btn-primary">Submit</button>
</form>
<p></p>
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
    },
     say: function (message) {
      alert(message)
    },
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