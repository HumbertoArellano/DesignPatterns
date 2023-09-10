package com.arellano.presentation;

import com.arellano.designpatterns.openclose.IComida;

public class PresentationOpenClose {
    public void comidaPorDepartamentoDeLaGranja(IComida comida){
        System.out.println(comida.cantidadDeComidaPorEstablecimiento());
    }
}
