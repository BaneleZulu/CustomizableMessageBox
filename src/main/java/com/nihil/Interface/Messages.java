/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nihil.Interface;

/**
 *
 * @author LATITUDE 5410
 */
import java.awt.*;

public interface Messages {

    public abstract void plainMessage(String message, String messageHeading);

    public abstract void informationMessage(String message, String messageHeading);

    public abstract void warningMessage(String message, String messageHeading);

    public abstract void questionMessage(String message, String messageHeading);

    public abstract void errorMessage(String message, String messageHeading);

    public abstract void customMessage(String message, String messageHeading, String url, Color color, Color lineColor);
}
