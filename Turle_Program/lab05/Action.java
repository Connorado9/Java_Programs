package com.eimacs.lab05;

import com.eimacs.lab05gui.Turtle;
import java.awt.Graphics;

/**
 * @author Connorado
 * @version 1.1 2/28/18
 */
public abstract class Action
{
  public Action()
  {
  }

  public abstract void execute( Turtle t, Graphics g );
}
