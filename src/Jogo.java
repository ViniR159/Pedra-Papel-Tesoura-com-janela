
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Jogo {

    public Jogo(String escolhaJogador, Janela janela){
        janela.SuaEscolha.setText("");
        Random random = new Random();
        
        String[] opcoes = { "PEDRA", "PAPEL", "TESOURA" };
        int numeroDaEscolha = random.nextInt(opcoes.length);
        String escolhaMaquina = opcoes[numeroDaEscolha];
        
        ImageIcon pedra = new ImageIcon(getClass().getResource("/img/pedra.png"));
        ImageIcon papel = new ImageIcon(getClass().getResource("/img/papel.png"));
        ImageIcon tesoura = new ImageIcon(getClass().getResource("/img/tesoura.png"));
        
        switch (escolhaMaquina) {
            case "PEDRA" -> janela.EscolhaMunitor.setIcon(pedra);
            case "PAPEL" -> janela.EscolhaMunitor.setIcon(papel);
            case "TESOURA" -> janela.EscolhaMunitor.setIcon(tesoura);
        }
        
        switch (escolhaJogador) {
            case "PEDRA" -> janela.SuaEscolha.setIcon(pedra);
            case "PAPEL" -> janela.SuaEscolha.setIcon(papel);
            case "TESOURA" -> janela.SuaEscolha.setIcon(tesoura);
        }

        if (escolhaJogador.equals(escolhaMaquina)) {
            janela.Resultado.setText("EMPATOU");
            JOptionPane.showMessageDialog(null, "EMPATOU");
            
        } else if ((escolhaJogador.equals("PEDRA") && escolhaMaquina.equals("TESOURA")) ||
                (escolhaJogador.equals("TESOURA") && escolhaMaquina.equals("PAPEL")) ||
                (escolhaJogador.equals("PAPEL") && escolhaMaquina.equals("PEDRA"))) {
            janela.Resultado.setText("GANHOU");
            JOptionPane.showMessageDialog(null, "GANHOU");
            
        } else {
            janela.Resultado.setText("PERDEU");
            JOptionPane.showMessageDialog(null, "PERDEU");
        }



    }    
}
