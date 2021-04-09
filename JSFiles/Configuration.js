"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.config = {
    //directConnect :true,
    framework: 'custom',
    seleniumAddress: "http://localhost:4444/wd/hub/",
    frameworkPath: require.resolve('protractor-cucumber-framework'),
    Capabilities: {
        browserName: 'chrome'
    },
    chromeOptions: {
        w3c: false,
        args: ["--headless", "--disable-gpu", "--window-size=800,600", "--disable-dev-shm-usage"
        ]
    },
    maxInstances: 1,
    specs: ['../Feature/practice.feature'],
    cucumberOpts: {
        require: 'StepDefinition/practice.js'
    }
};
//# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJmaWxlIjoiQ29uZmlndXJhdGlvbi5qcyIsInNvdXJjZVJvb3QiOiIiLCJzb3VyY2VzIjpbIi4uL0NvbmZpZ3VyYXRpb24udHMiXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6Ijs7QUFFVyxRQUFBLE1BQU0sR0FBWTtJQUM3QixzQkFBc0I7SUFDdEIsU0FBUyxFQUFFLFFBQVE7SUFDbkIsZUFBZSxFQUFHLCtCQUErQjtJQUNqRCxhQUFhLEVBQUMsT0FBTyxDQUFDLE9BQU8sQ0FBQywrQkFBK0IsQ0FBQztJQUU5RCxZQUFZLEVBQUM7UUFFVCxXQUFXLEVBQUUsUUFBUTtLQUV4QjtJQUVELGFBQWEsRUFBRTtRQUNYLEdBQUcsRUFBRSxLQUFLO1FBQ1YsSUFBSSxFQUFFLENBQUUsWUFBWSxFQUFFLGVBQWUsRUFBRSx1QkFBdUIsRUFBRSx5QkFBeUI7U0FDNUY7S0FFSTtJQUVELFlBQVksRUFBRyxDQUFDO0lBQ3BCLEtBQUssRUFBRSxDQUFDLDZCQUE2QixDQUFDO0lBRXRDLFlBQVksRUFBRTtRQUVWLE9BQU8sRUFBQyw0QkFBNEI7S0FDdkM7Q0FDQSxDQUFDIn0=