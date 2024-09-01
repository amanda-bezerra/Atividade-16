package br.com.amanda.atv16;

import android.content.Intent; // Importando a mágica para mudar de tela.
import android.os.Bundle; // O pacote de sobrevivência para quando a tela é criada.
import android.view.View; // Permite interagir com os botões e afins.
import android.widget.Button; // Nosso querido botão.
import androidx.appcompat.app.AppCompatActivity; // Base para uma Activity moderna e estilosa.

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { // O que acontece quando a tela principal nasce.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Ligando nossa tela ao layout que criamos.

        // Dando nome ao botão para poder conversar com ele mais tarde.
        Button BotoesEnviarDados = findViewById(R.id.BotoesEnviarDados);

        // Quando o botão for clicado, esse pedaço de código é chamado.
        BotoesEnviarDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Criando a Intent para iniciar a SegundaActivity
                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);

                // Adicionando dados à Intent
                intent.putExtra("meuDouble", 10.5); // Um número quebrado para adoçar a viagem.
                intent.putExtra("minhaString", "Olá, SegundaActivity!"); // Uma mensagem simpática.
                intent.putExtra("meuInt", 42); // E o número mágico da vida, o universo e tudo mais.

                // Iniciando a SegundaActivity
                startActivity(intent);
            }
        });
    }
}
