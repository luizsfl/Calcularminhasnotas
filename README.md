# Calcularminhasnotas
### O Calcularminhasnotas aprova quando o aluno tiver uma media maior que 5 e tiver menos que 20 faltas
![image](https://user-images.githubusercontent.com/70184804/152084438-73210c46-5187-420f-a2fa-f3f5ae8312d8.png)

![image](https://user-images.githubusercontent.com/70184804/152084492-9bb7a17a-46b0-46b9-b298-1d4a976cf5a2.png)


### Verifica se todos os campos foram preenchidos
```
        if(nota1.isEmpty() || nota2.isEmpty() ||nota3.isEmpty() ||nota4.isEmpty() || faltas.isEmpty()) {
            mensagem = "Existe campo em branco, favor realizar o preenchimento"
        }else{
            media = (nota1.toDouble() + nota2.toDouble() + nota3.toDouble() + nota4.toDouble())/4
        }

```


### Valida média e a quantidade de faltas
```
        if ( mensagem.isEmpty() && (media > 5) && (faltas.toInt()<20)){
            mensagem = "Aprovado!!!Parabens!! nota " + (media).toString() + " Faltas " + faltas
        }else if(mensagem.isEmpty() && faltas.toInt()>=20){
            mensagem = "Reprovado por falta " + faltas + " Nota " + (media).toString()
        }else if(mensagem.isEmpty() && media <= 5){
            mensagem = "Reprovado por nota " + (media).toString() + " Faltas " + faltas
        }

```
