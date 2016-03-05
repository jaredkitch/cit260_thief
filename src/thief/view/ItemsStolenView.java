/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief.view;

/**
 *
 * @author Jon
 */
public class ItemsStolenView extends View {
    
    public ItemsStolenView() {
        super( 
        "\n.-------------------------------------------------------------------"
      + "\n| Items you have Stolen                                             "
      + "\n| (This list may change depending on what you have stolen)          " 
      + "\n|  - Select an option to see a description of the item"
      + "\n|-------------------------------------------------------------------"
      + "\n| E - Painting"
      + "\n| M - Sculpture"
      + "\n| C - Vase"
      + "\n| Q - Quit"
      + "\n|-------------------------------------------------------------------");
    }
    
//still need to find a way to set what items they have or don't have
    @Override
    public boolean doAction(String choice) {
        
        switch (choice) {
            case "E":
                this.paintingDescription();
                break;
            case "M":
                this.sculptureDescription();
                break;
            case "C":
                this.vaseDescription();
                break;
            default:
                System.out.println(
                                     "\n***************************************"
                                   + "\n***** Invalid Selection Try Again *****"
                                   + "\n***************************************");
                break;
        }
        return false;
    }

    private void paintingDescription() {
        System.out.println(
        "\n.-------------------------------------------------------------------"
      + "\n| Renaissance Painting"
      + "\n|-------------------------------------------------------------------"
      + "\n| Let's be honest who knows much about art? All you know is that this"
      + "\n| painting is close to the oldest thing in the mueseum and draws a"
      + "\n| lot of attention from security during the day, so it must be worth"
      + "\n| something right?"
      + "\n'-------------------------------------------------------------------"
        );
    }

    private void sculptureDescription() {
        System.out.println(
        "\n.-------------------------------------------------------------------"
      + "\n| Small Sculpture"
      + "\n|-------------------------------------------------------------------"
      + "\n| This sculpture is actually piece worth keeping. It is a marble dog"
      + "\n| with gems studded across the collar and in the eyes. Even if you  "
      + "\n| can't sell the sculpture the gems along should fetch a great price."
      + "\n'-------------------------------------------------------------------"
        );
    }

    private void vaseDescription() {
        System.out.println(
        "\n.-------------------------------------------------------------------"
      + "\n| Antique Vase"
      + "\n|-------------------------------------------------------------------"
      + "\n| This vase has a a lot of writting along the sides that apparently "
      + "\n| tell a story of an ancient king. IF any of that is true no one    "
      + "\n| will ever really know, but you do know it's worth money and that  "
      + "\n| is all that matters to you!"
      + "\n'-------------------------------------------------------------------"
        );
    }


}


