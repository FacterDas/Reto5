/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.InterFace;

import com.example.demo.Modelo.Client;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author facte
 */
public interface ClientInterface extends CrudRepository <Client, Integer>{
    
}
