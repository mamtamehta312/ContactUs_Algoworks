"use strict";
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : new P(function (resolve) { resolve(result.value); }).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
Object.defineProperty(exports, "__esModule", { value: true });
const cucumber_1 = require("cucumber");
const protractor_1 = require("protractor");
cucumber_1.Given('I launched the url', { timeout: 60 * 1000 }, function () {
    return __awaiter(this, void 0, void 0, function* () {
        protractor_1.browser.get("http://way2automtaion.com/angularjs-protractor/banking/#/login");
    });
});
//# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJmaWxlIjoicHJhY3RpY2UuanMiLCJzb3VyY2VSb290IjoiIiwic291cmNlcyI6WyJwcmFjdGljZS50cyJdLCJuYW1lcyI6W10sIm1hcHBpbmdzIjoiOzs7Ozs7Ozs7O0FBQUEsdUNBQXdDO0FBQ3hDLDJDQUFpQztBQUVqQyxnQkFBSyxDQUFDLG9CQUFvQixFQUFDLEVBQUMsT0FBTyxFQUFDLEVBQUUsR0FBQyxJQUFJLEVBQUUsRUFBRzs7UUFDaEQsb0JBQU8sQ0FBQyxHQUFHLENBQUMsZ0VBQWdFLENBQUMsQ0FBQTtJQUk3RSxDQUFDO0NBQUEsQ0FDQSxDQUFBIn0=