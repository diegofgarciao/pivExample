module.exports = (function(){

  var mostrar = function(args, successCallback, errorCallback){
    cordova.exec(successCallback, errorCallback, "example", "funcionJava", [args]);};

  return {
    functionHello:mostrar
  };


})();
