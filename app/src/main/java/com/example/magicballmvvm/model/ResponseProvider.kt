package com.example.magicballmvvm.model

class ResponseProvider {
    companion object {

        fun random(): ResponseModel{
            val position: Int = (0..19).random()
            return  response[position]
        }

        private val response = listOf<ResponseModel>(
            ResponseModel(
                response = "Es cierto."
            ),
            ResponseModel(
                response = "Es decididamente así."
            ),
            ResponseModel(
                response = "Sin lugar a dudas."
            ),
            ResponseModel(
                response = " Sí, definitivamente."
            ),
            ResponseModel(
                response = "Puedes confiar en ello"
            ),
            ResponseModel(
                response = "Como yo lo veo, sí."
            ),
            ResponseModel(
                response = "Lo más probable."
            ),
            ResponseModel(
                response = "Perspectiva buena."
            ),
            ResponseModel(
                response = "Sí."
            ),
            ResponseModel(
                response = "Las señales apuntan a que sí."
            ),
            ResponseModel(
                response = "Respuesta confusa, vuelve a intentarlo."
            ),
            ResponseModel(
                response = "Vuelve a preguntar más tarde."
            ),
            ResponseModel(
                response = "Mejor no decirte ahora."
            ),
            ResponseModel(
                response = "No se puede predecir ahora."
            ),
            ResponseModel(
                response = "Concéntrate y vuelve a preguntar."
            ),
            ResponseModel(
                response = "No cuentes con ello."
            ),
            ResponseModel(
                response = "Mi respuesta es no."
            ),
            ResponseModel(
                response = "Mis fuentes dicen que no."
            ),
            ResponseModel(
                response = "Las perspectivas no son muy buenas"
            ),
            ResponseModel(
                response = "Muy dudoso."
            )


        )
    }

}