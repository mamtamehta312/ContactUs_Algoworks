import {When,Then,Given} from "cucumber"
import{browser} from "protractor"

Given('I launched the url',{timeout:60*1000 } , async function(){
browser.get("https://www.flipkart.com/")
await browser.sleep(2000);


}
)