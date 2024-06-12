import requests
from bs4 import BeautifulSoup

# Send a GET request to the url
url = 'https://www.google.com/'
response = requests.get(url)

# Parse the HTMl content using BeautifulSoup
soup = BeautifulSoup(response.content, 'html.parser')

# Print the title of the page
print(soup.title.text)
