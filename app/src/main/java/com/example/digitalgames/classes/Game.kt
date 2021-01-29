package com.example.digitalgames.classes

import java.io.Serializable

data class Game(
    var id: String="",
    var nome: String="",
    var ano: String="",
    var descricao: String="",
    var capa: String=""
): Serializable