package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;

public class TarifasTest {

    @Test
    public void given_DiasAntelacion21AndEdad17_ThenTarifaBaseDiscount20Percent(){
        double tarifaConDescuento = CalculadorDescuentos.calculoTarifa(100, 21, 17);
        Assert.assertEquals(80D, tarifaConDescuento, 0.0001D);
    }

    @Test
    public void given_DiasAntelacion21AndEdad70_ThenTarifaBaseDiscount23Percent(){
        double tarifaConDescuento = CalculadorDescuentos.calculoTarifa(100, 21, 70);
        Assert.assertEquals(77D, tarifaConDescuento, 0.0001D);
    }

    @Test
    public void given_DiasAntelacion21AndEdad34_ThenTarifaBaseDiscount15Percent(){
        double tarifaConDescuento = CalculadorDescuentos.calculoTarifa(100, 21, 34);
        Assert.assertEquals(85D, tarifaConDescuento, 0.0001D);
    }

    @Test
    public void given_DiasAntelacion15AndEdad17_ThenTarifaBaseDiscount5Percent(){
        double tarifaConDescuento = CalculadorDescuentos.calculoTarifa(100, 15, 17);
        Assert.assertEquals(95D, tarifaConDescuento, 0.0001D);
    }

    @Test
    public void given_DiasAntelacion15AndEdad70_ThenTarifaBaseDiscount8Percent(){
        double tarifaConDescuento = CalculadorDescuentos.calculoTarifa(100, 15, 70);
        Assert.assertEquals(92D, tarifaConDescuento, 0.0001D);
    }

    @Test
    public void given_DiasAntelacion15AndEdad34_ThenTarifaBaseDiscount0Percent(){
        double tarifaConDescuento = CalculadorDescuentos.calculoTarifa(100, 15, 34);
        Assert.assertEquals(100D, tarifaConDescuento, 0.0001D);
    }

    @Test
    public void given_DiasAntelacion20AndEdad17_ThenTarifaBaseDiscount5Percent(){
        double tarifaConDescuento = CalculadorDescuentos.calculoTarifa(100, 20, 17);
        Assert.assertEquals(95D, tarifaConDescuento, 0.0001D);
    }

    @Test
    public void given_DiasAntelacion21AndEdad18_ThenTarifaBaseDiscount0Percent(){
        double tarifaConDescuento = CalculadorDescuentos.calculoTarifa(100, 21, 18);
        Assert.assertEquals(100D, tarifaConDescuento, 0.0001D);
    }

    @Test
    public void given_DiasAntelacion21AndEdad65_ThenTarifaBaseDiscount0Percent(){
        double tarifaConDescuento = CalculadorDescuentos.calculoTarifa(100, 21, 65);
        Assert.assertEquals(100D, tarifaConDescuento, 0.0001D);
    }
}
