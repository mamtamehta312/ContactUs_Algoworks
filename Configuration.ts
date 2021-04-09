import {Config,Capabilities} from "protractor"

export let config : Config = {
//directConnect :true,
framework :'custom',
seleniumAddress : "http://localhost:4444/wd/hub/",
frameworkPath:require.resolve('protractor-cucumber-framework'),

Capabilities:{

    browserName :'chrome'
   
},

chromeOptions: {
    w3c: false,
    args: [ "--headless", "--disable-gpu", "--window-size=800,600" ,"--disable-dev-shm-usage"
]
    
    },

    maxInstances : 1,
specs :['../Feature/practice.feature'],

cucumberOpts :{

    require:'StepDefinition/practice.js'
}
};