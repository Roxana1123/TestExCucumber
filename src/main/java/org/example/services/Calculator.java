package org.example.services;

import io.cucumber.java.zh_cn.而且;

// Clasa reprezinta schita unui obiect pe care il putem caracteriza dupa diverse trasaturi sau comportamente
public class Calculator {
    //    Atribute = trasaturile caracteristice ale unui obiect
    public String tipCalculator;
//    Constructor = este un mecanism de initializare a unui proiect in functie de atributele clasei
//    default = neparametrizat, scopul lui este de a seta niste informatii generale pt atribute

    public Calculator() {
        this.tipCalculator = "";

    }

    //    parametrizat, scopul lui este de a seta niste informatii generale pentru atribute
    public Calculator(String tipCalculator) {
        this.tipCalculator = tipCalculator;
    }

    //    comportament = reprezinta o serie de metode care definesc functionalitatile clasei
    public float sum(float a, float b) {
        float result = a + b;
        return result;
    }

    public float substract(float a, float b) {
        float result = a - b;
        return result;
    }

    public float divide(float a, float b) {
        float result = a / b;
        return result;
    }

    public float multiply(float a, float b) {
        float result = a * b;
        return result;
    }
}

