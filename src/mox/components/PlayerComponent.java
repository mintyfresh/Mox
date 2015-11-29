/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mox.components;

import java.awt.Component;

/**
 *
 * @author Mihail
 */
public class PlayerComponent extends Component
{
    
    private boolean controlled;

    public PlayerComponent(boolean controlled)
    {
        this.controlled = controlled;
    }

    public boolean isControlled()
    {
        return controlled;
    }

    public void setControlled(boolean controlled)
    {
        this.controlled = controlled;
    }
    
}
