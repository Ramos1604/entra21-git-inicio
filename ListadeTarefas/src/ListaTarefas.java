public class ListaTarefas {

    public class ListaTarefa {
        private int tamanhoLista;
        private String nomeLista;
        private ListaTarefas[] tarefas;

        public ListaTarefa(int tamanhoLista) {
            //TODO
        }

        public boolean adicionarTarefa(ListaTarefas tarefa) {
            //TODO
            return false;
        }

        public ListaTarefas buscarTarefa(int posicao) {
            //TODO
            return null;
        }

        public boolean alterarOrdemTarefa(ListaTarefas tarefa, int novaPosicao) {
            //TODO
            return false;
        }

        // GETTER & SETTER

        public int getTamanhoLista() {
            return tamanhoLista;
        }

        public void setTamanhoLista(int tamanhoLista) {
            this.tamanhoLista = tamanhoLista;
        }

        public String getNomeLista() {
            return nomeLista;
        }

        public void setNomeLista(String nomeLista) {
            this.nomeLista = nomeLista;
        }

        public ListaTarefas[] getTarefas() {
            return tarefas;
        }

        public void setTarefas(ListaTarefas[] tarefas) {
            this.tarefas = tarefas;
        }
    }
}
