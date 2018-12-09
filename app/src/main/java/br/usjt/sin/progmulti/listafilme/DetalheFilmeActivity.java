package br.usjt.sin.progmulti.listafilme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
/*
 *@Author: Lucas Gabriel Teniz
 *@RA: 81612246
 */
public class DetalheFilmeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_filme);
        TextView nome = (TextView)findViewById(R.id.filme_selecionado);
        Intent intent = getIntent();

        nome.setText(intent.getStringExtra(ListarFilmesActivity.DESCRICAO));
    }
}
