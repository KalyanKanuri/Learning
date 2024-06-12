from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager

service = Service(ChromeDriverManager().install())
driver = webdriver.Chrome(service=service)
url = "https://www.google.com/"

driver.get(url)
driver.maximize_window()

print(driver.title)
