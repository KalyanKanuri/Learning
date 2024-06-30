import scrapy


class PopulationCounterSpider(scrapy.Spider):
    name = "population_counter"
    allowed_domains = ["www.worldometers.info"]
    start_urls = ["https://www.worldometers.info/world-population/population-by-country/"]

    def parse(self, response):
        for country in response.css("table#example2 tbody tr"):
            yield {
                "country": country.css("td:nth-child(1)::text").get(),
                "population": country.css("td:nth-child(3)::text").get()
            }
