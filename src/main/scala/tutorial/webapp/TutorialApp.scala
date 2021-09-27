package tutorial.webapp

import org.scalajs.dom
import org.scalajs.dom.{CanvasRenderingContext2D, Event, console, document, html}

import scala.scalajs.js
import js.annotation._

object TutorialApp {
  def main(args: Array[String]): Unit = {
    document.addEventListener("DOMContentLoaded", { (e: dom.Event) =>
      setupUI()
    })
  }

  def setupUI(): Unit = {
    val button = document.createElement("button")
    button.textContent = "Click me!!!!"
    button.addEventListener("click", { (e: dom.MouseEvent) =>
      addClickedMessage()
    })
    document.body.appendChild(button)
    // ---
    val label = document.createElement("label").asInstanceOf[html.Label]
    label.textContent =  "Years"
    document.body.appendChild(label)
    // ---
    val input1 = document.createElement("input").asInstanceOf[html.Input] // <input type="text" id="fname" name="fname
    input1.addEventListener("keyup", { (event: dom.KeyboardEvent) =>
      if (event.keyCode == 13) { // return
        event.preventDefault()
        boogaloo(input1.value.toInt)
      }
    })
    document.body.appendChild(input1)

    appendPar(document.body, "Hello World")
  }

  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    parNode.textContent = text
    targetNode.appendChild(parNode)
  }

  def addClickedMessage(): Unit = {
    appendPar(document.body, "You clicked the button!")
  }

  def boogaloo(i:Int): Unit = {
    appendPar(document.body, "boogaloo="+i)
  }

}

