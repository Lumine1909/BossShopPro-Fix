package studio.magemonkey.genesis.managers.serverpinging;

public interface ServerConnector {


    /**
     * Update the server info or not
     *
     * @param info info to update
     * @return updaed or not
     */
    boolean update(ServerInfo info);

}
