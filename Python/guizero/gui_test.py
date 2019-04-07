from guizero import App, Text, TextBox, PushButton, Slider, Picture

def say_my_name():
    welcome_message.set(my_name.get())
def change_text_size(slider_value):
    welcome_message.font_size(slider_value)
    
app = App(title="Hello Python")
welcome_message = Text(app, text="Welcome to my app", size=40, font="Times New Roman", color="lightblue")
my_name = TextBox(app,text="input something")
update_text = PushButton(app, command=say_my_name, text="Display my name")
text_size = Slider(app,command=change_text_size,start=10,end=80)
my_game = Picture(app,image="good_game.gif")

app.display()

