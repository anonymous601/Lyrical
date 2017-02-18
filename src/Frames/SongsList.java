/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

 
/**
 *
 * @author nisha
 */


public class SongsList extends javax.swing.JFrame{

    /**
     * Creates new form SongsList
     */
    public SongsList() {
        initComponents();
        //Have to add a checkbox option in JTable so that we can perform delet operation...For eg. we can delete multiple songs
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        heading = new javax.swing.JLabel();
        add_song = new javax.swing.JButton();
        create_playlist = new javax.swing.JButton();
        playlists = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        song_list = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        heading.setFont(new java.awt.Font("DaunPenh", 1, 40)); // NOI18N
        heading.setForeground(new java.awt.Color(102, 102, 255));
        heading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/newpackage/note-341057_1280.png"))); // NOI18N
        heading.setText(" LYRICAL");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, heading, org.jdesktop.beansbinding.ELProperty.create("${border.borderOpaque}"), heading, org.jdesktop.beansbinding.BeanProperty.create("horizontalAlignment"));
        bindingGroup.addBinding(binding);

        add_song.setBackground(new java.awt.Color(102, 102, 255));
        add_song.setForeground(new java.awt.Color(255, 255, 255));
        add_song.setText("Add Song");
        add_song.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_songActionPerformed(evt);
            }
        });

        create_playlist.setBackground(new java.awt.Color(102, 102, 255));
        create_playlist.setForeground(new java.awt.Color(255, 255, 255));
        create_playlist.setText("Create Playlist");
        create_playlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_playlistActionPerformed(evt);
            }
        });

        playlists.setBackground(new java.awt.Color(102, 102, 255));
        playlists.setForeground(new java.awt.Color(255, 255, 255));
        playlists.setText("Playlists");
        playlists.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playlistsActionPerformed(evt);
            }
        });

        song_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial Number", "Name", "Artist", "Album", "Genre", "Length"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(song_list);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/newpackage/note-341057_1280.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(add_song, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                        .addComponent(create_playlist, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(playlists, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(playlists, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(create_playlist, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(add_song, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void create_playlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_playlistActionPerformed
     
        String playlist_name=(String)JOptionPane.showInputDialog("Create Your Playlist\n");// creating a playlist
        System.out.println(playlist_name);
        // will add the feature of adding the songs to this playlist later...
    }//GEN-LAST:event_create_playlistActionPerformed

    private void add_songActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_songActionPerformed
        JTextField songName=new JTextField();
        JTextField artistName=new JTextField();
        JTextField albumName=new JTextField();
        JTextField filePath=new JTextField(); // will have to find the length of song using this path and i dont know how to do it...
        /**
         * I know we can also get the song name, artist name and album name from filePath
         * But i dont know how to do that
         * if anyone knows ...Then add it later
         * for now ...its ok...
         */
        final JComponent[] inputs = new JComponent[]{
            new JLabel("Song Name : "),
            songName,
            new JLabel("Artist Name : "),
            artistName,
            new JLabel("Album Name : "),
            albumName,
            new JLabel("File Path : "),
            filePath
        };
        int result = JOptionPane.showConfirmDialog(null, inputs, "Add Song ", JOptionPane.PLAIN_MESSAGE);
        if(result==JOptionPane.OK_OPTION)
        {  
            JOptionPane.showMessageDialog(rootPane,"Song Added!");
        }
    }//GEN-LAST:event_add_songActionPerformed

    private void playlistsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playlistsActionPerformed
        PlaylistPage p1=new PlaylistPage();
        p1.setVisible(true);
        p1.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                p1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                p1.setVisible(false);
            }
        });
    }//GEN-LAST:event_playlistsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_song;
    private javax.swing.JButton create_playlist;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton playlists;
    private javax.swing.JTable song_list;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
