import Home from './components/home/Home.vue';
import Pessoa from './components/cadastro/Pessoa.vue';
import Espaco from './components/cadastro/Espaco.vue';
import Sala from './components/cadastro/Sala.vue';

export const routes = [
    {path: '', component: Home},
    {path: '/pessoa', component: Pessoa},
    {path: '/espaco', component: Espaco},
    {path: '/sala', component: Sala}
];