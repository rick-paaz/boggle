package view_controller;


import static org.junit.Assert.assertTrue;

/**
 * A console based version of the Boggle game that you will design.
 * You must have a way for Boggle to have access to fixed.
 *  
 * @author YOUR NAME and Rick Mercer
 */
import model.DiceTray;

public class BoggleConsole {
  
  public static void main(String[] args) {
 
    char[][] fixed = {   
        { 'A', 'B', 'S', 'E' },     
        { 'I', 'M', 'T', 'N' },       
        { 'N', 'D', 'E', 'D' },       
        { 'S', 'S', 'E', 'N' },      
    };
    
    DiceTray tray = new DiceTray(fixed);
    
    // These assertions should pass. Delete them when
    // you observe one asserts failed in the console.
    assertTrue(tray.found("aBsEnT")) ;
    assertTrue(tray.found("MiNd")) ;
    assertTrue(tray.found("Not Here"));  // This should fail!
 
    
    // TODO: Construct a new Boggle object that has
    // access to the DiceTray object referenced by tray.
    
  }
}