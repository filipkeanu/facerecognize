/*global cordova, module*/

module.exports = {
    startfacerecognize: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "facerecognize", "startfacerecognize", [name]);
    }
};
