import Home from './components/home/Home.vue';
import Pessoa from './components/cadastro/Pessoa.vue';
import Espaco from './components/cadastro/Espaco.vue';
import Sala from './components/cadastro/Sala.vue';
import PessoaID from './components/listar/Pessoa.vue';
import EspacoID from './components/listar/Espaco.vue';
import SalaID from './components/listar/Sala.vue';

export const routes = [
    {path: '', component: Home},
    {path: '/pessoa', component: Pessoa},
    {path: '/pessoa/:id', name:'pessoa',  component: PessoaID},
    {path: '/espaco', component: Espaco},
    {path: '/espaco/:id', name:'espaco',  component: EspacoID},
    {path: '/sala', component: Sala},
    {path: '/sala/:id', name:'sala',  component: SalaID}
];