/**
 * The Operations class contains methods for calculating the square, cube, and modulus of a given
 * number.
 */

public class Operations{
/**
 * The function "squ" takes a float operand and returns its square.
 * 
 * @param operand1 The parameter "operand1" is a float value that represents the number to be squared.
 * @return the square of the operand1 value.
 */
   public float squ(float operand1){
      return(operand1*operand1);
   }
  /**
   * The cube function takes a float operand and returns the cube of that operand.
   * 
   * @param operand1 The parameter "operand1" is a float value that represents the number you want to
   * calculate the cube of.
   * @return The cube of the operand1 value.
   */
   public float cube(float operand1){
      return(operand1*operand1*operand1);
   }
/**
 * The modulus function calculates the remainder when operand1 is divided by operand2.
 * 
 * @param operand1 The first operand for the modulus operation.
 * @param operand2 The second operand in the modulus operation.
 * @return The modulus of operand1 divided by operand2.
 */
   public float modulus(float operand1,float operand2){
      return(operand1 % operand2);
   }
}