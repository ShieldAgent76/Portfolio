////////////////////////////////////////////////////////////////////
/// T INFO 200 A, Winter 2022
/// UW Tacoma SET, Charles Costarella (Chuck)
/// L4calc
/// Calculator
/// This is a calculator program created from C#
/// Has basic function of calculator (addition, multiplication, etc)
/// 
/// Change history
/// Date ------ Developer ----- Description
/// 1-26-22 --- lillom -------- Created Calculator program
/// 1-28-22 --- lillom -------- C# calculator code from instructables link:
/// https://www.instructables.com/Creating-a-Calculator-Visual-Studio-C/
/// 1-28-22 --- lillom -------- added TableLayoutPanel to layout where the buttons will be
/// 1-28-22 --- lillom -------- added "hello" and "funny" custom button
/// 1-28-22 --- lillom -------- button click event help from youtube video:
/// https://www.youtube.com/watch?v=iJqB6UsM-hs
/// 1-28-22 --- lillom -------- changed positive/negative button to UW
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

// namespace for calculator program
namespace Calculator
{
    // class for calculator buttons acting as the event handlers
    public partial class Form1 : Form
    {
        // variables for storing input
        string userInput = string.Empty;
        string operand1 = string.Empty;
        string operand2 = string.Empty;
        char operationInput;

        // calculation output
        double calcResult = 0;

        // calculator code from instructables

        // calculator object constructor
        public Form1()
        {
            InitializeComponent();
        }

        // "1" button
        private void button5_Click(object sender, EventArgs e)
        {
            // under "Events" for the buttons, whenever it gets clicked on, it will call the method
            // for example, whenever it clicks on the 1 button, it will call button5_Click method
            // since that is the operation it is doing, adding the one to the textbox
            // this is reference to the youtube video above

            this.textBox1.Text = "";
            userInput += "1";
            this.textBox1.Text += userInput;
        }
        // calculator code above from instructables

        // "clear entry (CE)" button
        private void button1_Click(object sender, EventArgs e)
        {
            this.textBox1.Text = "0";
            this.userInput = string.Empty;
            this.operand1 = string.Empty;
            this.operand2 = string.Empty;
        }
        // calculator code above from instructables

        // "9" button
        private void button15_Click(object sender, EventArgs e)
        {
            this.textBox1.Text = "";
            userInput += "9";
            this.textBox1.Text += userInput;
        }
        // calculator code above from instructables

        // "equals" button
        private void button20_Click(object sender, EventArgs e)
        {
            operand2 = userInput;
            double num1;
            double num2;
            double.TryParse(operand1, out num1);
            double.TryParse(operand2, out num2);

            if (operationInput == '+')
            {
                calcResult = num1 + num2;
                this.textBox1.Text = calcResult.ToString();
            }
            else if (operationInput == '-')
            {
                calcResult = num1 - num2;
                this.textBox1.Text = calcResult.ToString();
            }
            else if (operationInput == '*')
            {
                calcResult = num1 * num2;
                this.textBox1.Text = calcResult.ToString();
            }
            else if (operationInput == '/')
            {
                if (num2 == 0)
                {
                    this.textBox1.Text = "Zero Error!";
                }
                else
                {
                    calcResult = num1 / num2;
                    this.textBox1.Text = calcResult.ToString();
                }
            }
        }
        // calculator code above from instructables

        // "funny" button, this button will input "69" into the calculator
        private void button2_Click(object sender, EventArgs e)
        {
            this.textBox1.Text = "";
            userInput += "69";
            this.textBox1.Text += userInput;
        }

        // "hello" button, this button will input "43110" into the calculator
        private void button3_Click(object sender, EventArgs e)
        {
            this.textBox1.Text = "";
            userInput += "43110";
            this.textBox1.Text += userInput;
        }

        // "/" button, divison
        private void button4_Click(object sender, EventArgs e)
        {
            operand1 = userInput;
            operationInput = '/';
            userInput = string.Empty;
        }
        // calculator code above from instructables

        // "*" button, multiplication
        private void button8_Click(object sender, EventArgs e)
        {
            operand1 = userInput;
            operationInput = '*';
            userInput = string.Empty;
        }
        // calculator code above from instructables

        // "3" button
        private void button7_Click(object sender, EventArgs e)
        {
            this.textBox1.Text = "";
            userInput += "3";
            this.textBox1.Text += userInput;
        }
        // calculator code above from instructables

        // "2" button
        private void button6_Click(object sender, EventArgs e)
        {
            this.textBox1.Text = "";
            userInput += "2";
            this.textBox1.Text += userInput;
        }
        // calculator code above from instructables

        // "4" button
        private void button9_Click(object sender, EventArgs e)
        {
            this.textBox1.Text = "";
            userInput += "4";
            this.textBox1.Text += userInput;
        }
        // calculator code above from instructables

        // "5" button
        private void button10_Click(object sender, EventArgs e)
        {
            this.textBox1.Text = "";
            userInput += "5";
            this.textBox1.Text += userInput;
        }
        // calculator code above from instructables

        // "6" button
        private void button11_Click(object sender, EventArgs e)
        {
            this.textBox1.Text = "";
            userInput += "6";
            this.textBox1.Text += userInput;
        }
        // calculator code above from instructables

        // "-" button, subtraction
        private void button12_Click(object sender, EventArgs e)
        {
            operand1 = userInput;
            operationInput = '-';
            userInput = string.Empty;
        }
        // calculator code above from instructables

        // "+" button, addition
        private void button16_Click(object sender, EventArgs e)
        {
            operand1 = userInput;
            operationInput = '+';
            userInput = string.Empty;
        }
        // calculator code above from instructables

        // "8" button
        private void button14_Click(object sender, EventArgs e)
        {
            this.textBox1.Text = "";
            userInput += "8";
            this.textBox1.Text += userInput;
        }
        // calculator code above from instructables

        // "7" button
        private void button13_Click(object sender, EventArgs e)
        {
            this.textBox1.Text = "";
            userInput += "7";
            this.textBox1.Text += userInput;
        }
        // calculator code above from instructables

        // "UW" button, this button will input "1861" (year founded) into the calculator
        private void button17_Click(object sender, EventArgs e)
        {
            this.textBox1.Text = "";
            userInput += "1861";
            this.textBox1.Text += userInput;
        }
        // calculator code above from instructables

        // "0" button
        private void button18_Click(object sender, EventArgs e)
        {
            this.textBox1.Text = "";
            userInput += "0";
            this.textBox1.Text += userInput;
        }
        // calculator code above from instructables

        // "." button, decimal
        private void button19_Click(object sender, EventArgs e)
        {
            this.textBox1.Text = ""; 
            userInput += ".";
            this.textBox1.Text += userInput;
        }
        // calculator code above from instructables        
    }
}
