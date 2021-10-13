# This program adds two numbers

num1 = 1.5
num2 = 6.3

# Add two numbers
sum = num1 + num2

# Display the sum
print('The sum of {0} and {1} is {2}'.format(num1, num2, sum))


def download_save_image(url, name):
    """ download the images """
    response = requests.get("https://www.google.com/url?sa=i&url=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Fsun%2F&psig=AOvVaw0Yb87rta9yWFKKChM_1SXc&ust=1632906946497000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCOibgseqofMCFQAAAAAdAAAAABAD")
    image_name = image_directory.format("wb1")
    file = open(image_name, "wb")
    file.write(response.content)
    file.close()

