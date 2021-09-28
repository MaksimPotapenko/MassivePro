/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massivepro;

import java.util.Random;

/**
 *
 * @author Максонио
 */
public class MassivePro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random=new Random();
        double summa=0; 
        int value=0;
        int[] nums;
        nums= new int[20]; 
        for (int i = 0; i < nums.length; i++) {  
            int numRandom=random.nextInt(21)&-2;
            nums[i]+=numRandom;
            value=value+1;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%4d",nums[i]);
            
        }
        int maxInt=0;
        for (int i = 0; i <nums.length; i++) {
            if(maxInt<nums[i]){
                maxInt=nums[i];
            }
        }
        int minInt=value;
        for (int i = 0; i <nums.length; i++) {
            if(minInt>nums[i]){
                minInt=nums[i];
            }
            
        }
        for (int i = 0; i <nums.length; i++) {
            if(maxInt==nums[i]){
                nums[i]=0;
            }if(minInt==nums[i]){           
                nums[i]=0;

        }
            summa+=nums[i];
        }
        
        summa=summa/value;
        System.out.printf(" | Средняя арифмитическое строки - "+summa);
        System.out.println("");
    }
    
}
