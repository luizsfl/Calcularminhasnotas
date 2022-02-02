package alura.loja.calcularminhasnotas

import alura.loja.calcularminhasnotas.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
                 setContentView(binding.root)

        binding.calcular.setOnClickListener{
             calcular()
        }


    }

    private fun calcular(){
        val nota1    = binding.nota1.text.toString()
        val nota2    = binding.nota2.text.toString()
        val nota3    = binding.nota3.text.toString()
        val nota4    = binding.nota4.text.toString()
        val faltas   = binding.faltas.text.toString()
        var mensagem = ""
        var media = 0.0

        //validando se todos os campos foram digitados
        if(nota1.isEmpty() || nota2.isEmpty() ||nota3.isEmpty() ||nota4.isEmpty() || faltas.isEmpty()) {
            mensagem = "Existe campo em branco, favor realizar o preenchimento"
        }else{
            media = (nota1.toDouble() + nota2.toDouble() + nota3.toDouble() + nota4.toDouble())/4
        }

        //validar a media e a quantidade de faltas
        if ( mensagem.isEmpty() && (media > 5) && (faltas.toInt()<20)){
            mensagem = "Aprovado!!!Parabens!! nota " + (media).toString() + " Faltas " + faltas
        }else if(mensagem.isEmpty() && faltas.toInt()>=20){
            mensagem = "Reprovado por falta " + faltas + " Nota " + (media).toString()
        }else if(mensagem.isEmpty() && media <= 5){
            mensagem = "Reprovado por nota " + (media).toString() + " Faltas " + faltas
        }

        binding.mensagem.text = mensagem

    }
}